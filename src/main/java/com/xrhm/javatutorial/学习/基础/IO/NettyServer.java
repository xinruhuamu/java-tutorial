package com.xrhm.javatutorial.学习.基础.IO;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;

/*
 * 场景：客户端每隔两秒发送一个带有时间戳的"hello world"给服务端，服务端收到之后打印,先后运行  NettyServer.java 和NettyClient.java可看到效果。
 *
 * */
public class NettyServer {
    public static void main(String[] args) {
        ServerBootstrap serverBootstrap = new ServerBootstrap();

        NioEventLoopGroup boos = new NioEventLoopGroup();//接收新连接线程，负责创建新连接
        NioEventLoopGroup worker = new NioEventLoopGroup();//读取数据及业务逻辑处理

        serverBootstrap
                .group(boos, worker)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    protected void initChannel(NioSocketChannel channel) {
                        channel.pipeline().addLast(new StringDecoder());
                        channel.pipeline().addLast(new SimpleChannelInboundHandler<String>() {
                            @Override
                            protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
                                System.out.println(s);
                                System.out.println(Thread.currentThread().getName());
                            }
                        });
                    }
                })
                .bind(8000);
    }
}


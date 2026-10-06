package com.xs.xushuclaude;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class ToolService {

    //告诉大模型工具的作用
    @Tool(description = "执行shell命令")
    public String shellCommandTool(
            @ToolParam(description = "命令") String command){

        // TODO 执行shell命令
        System.out.println("执行shell命令："+command);
        return "执行成功";
    }
}

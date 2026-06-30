package com.pranjal.SpringAIToolProject.tools;

import java.time.LocalDateTime;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.context.i18n.LocaleContextHolder;

public class SpringAIToolClass{
	
	@Tool(description = "This tool is to have the current date and time")
	public String getDate() {
	
		return LocalDateTime.now().atZone(LocaleContextHolder.getTimeZone().toZoneId()).toString();
		
	}

}

package com.cos.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WindowAction10 implements Action{
@Override
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("window10 installed");
}
}

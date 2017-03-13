package com.example.tag;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.*;
import java.io.*;

public class Classic3 extends TagSupport {

	JspWriter out;
	
	// this is where a tag start:
	public int doStartTag()throws JspException{
		
		out = pageContext.getOut();
		try{
			out.println("Before body.");
		}catch(IOException ex){
			throw new JspException("IOException- " + ex.toString());
		}
		// This is what causes the body to be evaluated in a Classic tag handler!
		return EVAL_BODY_INCLUDE;
	}
	
	// this is where a tag end:
	public int doEndTag()throws JspException{
		try{
			out.println("After body.");
		}catch(IOException ex){
			throw new JspException("IOException- " + ex.toString());
		}
		// this saying keep going evaluate page after this:
		return EVAL_PAGE;
	}
}

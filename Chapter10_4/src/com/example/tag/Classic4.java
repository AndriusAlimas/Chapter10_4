package com.example.tag;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class Classic4 extends TagSupport{
	
	private int count;
	private JspWriter out;
	
	public int getCount(){
		return count;
	}
	public void setCount(int count){
		this.count = count;
	}
	
	public int doStartTag()throws JspException{
		
		out = pageContext.getOut();
		
		try{
			out.println("Before body...");
		}catch(IOException exc){
			throw new JspException("IOException- " + exc.toString());
		}
		// This is what causes the body to be evaluated in a Classic tag handler!
		return EVAL_BODY_INCLUDE;
	}
	
	public int doAfterBody()throws JspException{
		
		// we using attribute as count 
		while(count < 3){ // while count less then 3 do this:
			count++;
			
			return EVAL_BODY_AGAIN; // evaluate body tag!!!!!!
		}
		return SKIP_BODY; // end eavluate body tag!!
	}
	
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

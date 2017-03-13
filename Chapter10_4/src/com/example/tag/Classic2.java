package com.example.tag;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.*;
import java.io.*;

public class Classic2 extends TagSupport{
	
	JspWriter out;
	
	public int doStartTag()throws JspException{
		// for using later this object, to not repeat it self:
		out = pageContext.getOut();
		
		try
		{
			out.println("in doStartTag");
		}catch (IOException exc) {
			throw new JspException("IOException - " + exc.toString());
		}
		// This says, DONT evaluate the body if there is one-just go straight to the doEndTag() method:
		return SKIP_BODY;
	}
	public int doEndTag()throws JspException{
		
		try{
			out.println("in doEndTag()");
		}catch(IOException exc){
			throw new JspException("IOException - " + exc.toString());
		}
		
		// This say s Evaluate the rest of the page( as opposed to SKIP_PAGE, which would be just like 
		// throwing a SkipPageException from SimpleTag handler)
		return EVAL_PAGE;
	}
}

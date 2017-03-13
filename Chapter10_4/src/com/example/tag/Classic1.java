package com.example.tag;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.*;
import java.io.*;

// By extending TagSupport, we're implementing both Tag and IterationTag. Here we're overriding 
// only one method, doStartTag().
public class Classic1 extends TagSupport{
	// The methods declare JspException, but NOT an IOException!(The SimpleTag doTag() declares IOException)
	public int doStartTag() throws JspException{
		// Classic tags inherit a pageContext member variable from TagSupport ( in contrast to the getJspContext()
		// method of SimpleTag)
		JspWriter out = pageContext.getOut();
		try{
			out.println("classic tag output");
		}catch(IOException ex){
			// Here we must use try/catch, because we can't declare the IOException!S
			throw new JspException("IOException- " + ex.toString());
		}
		return SKIP_BODY; // We have to return an int to tell the Container what to do next.
	}
}

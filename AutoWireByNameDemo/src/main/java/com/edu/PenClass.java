package com.edu;

public class PenClass 
{
	private InkClass inkob;

	
	
	public InkClass getInkob() {
		return inkob;
	}



	public void setInkob(InkClass inkob) {
		this.inkob = inkob;
	}



	public void penWorking()
	{
		if(inkob!=null)
		{
			inkob.inkDisplay();
		}
		else
		{
			System.out.println("pen is not having ink...");
		}
	}

}

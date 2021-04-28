package mybean;
public class srbean
{
String language;
public void setLanguage(String la)
{
this.language=la;
}
public String getLanguage()
{
return language;
}
public String getComment()
{
if(language.equals("java"))
return "The King Of Object Oriented Language";
if(language.equals("dotnet"))
return "MicroSoft Technology";
else
return "Soory No Details";
}
}
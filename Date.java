public class Date {
   private int day,month,year;

   public Date(int day, int month, int year) {
       super();
       this.day = day;
       this.month = month;
       this.year = year;
   }

   public void addDays(int days)
   {
       day=day+days;
   }
  
   public void addWeeks(int weeks)
  
   {
       day=day+7*weeks;
      
       if(day>31)
       {
       int daydiff=day-31;
       month++;
       day=daydiff;
      
       }
      
   }
  
   public int getDay() {
       return day;
   }

   public void setDay(int day) {
       this.day = day;
   }

   public int getMonth() {
       return month;
   }

   public void setMonth(int month) {
       this.month = month;
   }

   public int getYear() {
       return year;
   }

   public void setYear(int year) {
       this.year = year;
   }

  
  
   public boolean isLeapYear(int year)
   {
       boolean isLeap = false;
         
if(year % 400 == 0)
{
isLeap = true;
}
else if (year % 100 == 0)
{
isLeap = false;
}
else if(year % 4 == 0)
{
isLeap = true;
}
else
{
isLeap= false;
}

return isLeap;
}
  
  
   public int daysTo(Date other)
   {
       int year1,month1,day1;
       day1=other.getDay();
       month1=other.getMonth();
       year1=other.getYear();
      
       int yeardiff,monthdiff,daydiff;
      
       if(year1>=year)
       {
           yeardiff=(year1-year);
          
           if(month1>month)
           {
               monthdiff=(month1-month);
           }
           else
           {
               monthdiff=month-month1;
           }
           if(day1>day)
           {
               daydiff=(day1-day);
           }
           else
           {
               daydiff=(day-day1);
           }
           return daydiff+30*monthdiff+365*yeardiff;
       }
       else
       {
               yeardiff=(year-year1);
          
           if(month1>month)
           {
               monthdiff=(month1-month);
           }
           else
           {
               monthdiff=month-month1;
           }
           if(day1>day)
           {
               daydiff=(day1-day);
           }
           else
           {
               daydiff=(day-day1);
           }
           return -(daydiff+30*monthdiff+365*yeardiff);
       }
      
   }

   public String toString()
   {
       return ""+year+"/"+month+"/"+day;
   }

}
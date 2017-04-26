public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
        
        MyDate earlier = comparedDate;
        MyDate later = this;
        
        if(this.earlier(comparedDate)){
          earlier = this;
          later = comparedDate;
        }
       
        
        
        int yearDiff = later.year - earlier.year;
        int monthDiff = later.month - earlier.month;
        int dayDiff = later.day - earlier.day;
        
        if(dayDiff < 0){
            monthDiff--;
        }
        
        if(monthDiff < 0){
            yearDiff--;
        }
        
        return yearDiff;
    }

}

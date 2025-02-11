public class University {
    public double creditfee;
    public double totalcreditcse;
    public double totalcreditbba;
    public double semesterfee;
    public double extra;
    public double admission;

    public University(double creditfee, double totalcreditcse,double totalcreditbba, double semesterfee,double extra,double admission) {
        this.creditfee = creditfee;
        this.totalcreditcse = totalcreditcse;
        this.totalcreditbba = totalcreditbba;
        this.semesterfee = semesterfee;
        this.extra= extra;
        this.admission = admission;
    }

    public double totalcostcse(){
        return (creditfee*totalcreditcse)+(semesterfee*12)+extra+admission;
    }
    public double totalcostbba(){
        return (creditfee*totalcreditbba)+(semesterfee*12)+extra+admission;
    }

}


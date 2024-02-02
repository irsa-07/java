import java.util.Calendar;
import java.util.Date;

public class ProfiliShendetsor {
	private String emri;
	private String mbiemri;
	private String gjinia;
	private Data datalindjes;
	private  double  gjatesia;
	private double pesha;
	
	public ProfiliShendetsor() {
		this.emri="";
		this.mbiemri="";
		this.datalindjes=new Data();
		this.gjinia="";
		this.gjatesia=0.0;
		this.pesha=0.0;
		
		
		
		
	}
	public ProfiliShendetsor(String emri,String mbiemri,String gjinia, double gjatesia,double pesha,Data datalindjes) {
		
		
	}
	public String getEmri() {
		return emri;
	}
	public void setEmri(String emri) {
		this.emri = emri;
	}
	public String getMbiemri() {
		return mbiemri;
	}
	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}
	public String getGjinia() {
		return gjinia;
	}
	public void setGjinia(String gjinia) {
		this.gjinia = gjinia;
	}
	public Data getDatalindjes() {
		return datalindjes;
	}
	public void setDatalindjes(Data datalindjes) {
		this.datalindjes = datalindjes;
	}
	public double getGjatesia() {
		return gjatesia;
	}
	public void setGjatesia(double gjatesia) {
		this.gjatesia = gjatesia;
	}
	public double getPesha() {
		return pesha;
	}
	public void setPesha(double pesha) {
		this.pesha = pesha;
	}
	
	public int getMosha(){
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		if (this.getDatalindjes().getMuaji() <= month)
			return year - this.getDatalindjes().getViti();
		else
			return year - this.getDatalindjes().getViti() - 1;

	}
	 public int getMaxeRrahjeve() {
		 
		 
	 }
	 
	 
		
	}
	



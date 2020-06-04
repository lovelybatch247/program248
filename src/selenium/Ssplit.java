package selenium;

public class Ssplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Twenty-five passengers were not allowed to board a Delhi-bound train from the Sabarmati railway station in Ahmedabad as they were found to have high temperature during screening at the main gate of the station, officials said.";
		String[] s2=s1.split("\\s");
		int nw=s2.length;
		System.out.println("No of words is : "+nw);
		String s3="The authorities on Tuesday imposed a 'complete lockdown' in parts of Uttar Pradesh's Aligarh for next seven days amid a rise in the number of coronavirus cases in the city. So far, the city has reported 61 infection cases, including five deaths. The orders will come into force from Tuesday midnight.";
		String[] s4=s3.split("\\.");
		int ns=s4.length;
		System.out.println("No of sentences is : "+ns);
	}

}

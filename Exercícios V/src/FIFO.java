import java.util.ArrayList;

public class FIFO {
	
	public static void main(String[] args) {
		
		Frame frame1 = new Frame();
		
		frame1.setId(1);
		frame1.setTempoCarga(12);
		frame1.setQtdRef(10);
		frame1.setTempoRef(20);
		frame1.setBr(1);
		frame1.setBm(1);
		
		System.out.println(frame1.getId());
		System.out.println(frame1.getTempoCarga());
		System.out.println(frame1.getQtdRef());
		System.out.println(frame1.getTempoRef());
		System.out.println(frame1.getBr());
		System.out.println(frame1.getBm());
		
		Frame frame2 = new Frame();
		
		frame2.setId(2);
		frame2.setTempoCarga(10);
		frame2.setQtdRef(1);
		frame2.setTempoRef(12);
		frame2.setBr(0);
		frame2.setBm(0);
		
		System.out.println(frame2.getId());
		System.out.println(frame2.getTempoCarga());
		System.out.println(frame2.getQtdRef());
		System.out.println(frame2.getTempoRef());
		System.out.println(frame2.getBr());
		System.out.println(frame2.getBm());
		
		Frame frame3 = new Frame();
		
		frame3.setId(3);
		frame3.setTempoCarga(11);
		frame3.setQtdRef(2);
		frame3.setTempoRef(21);
		frame3.setBr(1);
		frame3.setBm(0);
		
		System.out.println(frame3.getId());
		System.out.println(frame3.getTempoCarga());
		System.out.println(frame3.getQtdRef());
		System.out.println(frame3.getTempoRef());
		System.out.println(frame3.getBr());
		System.out.println(frame3.getBm());
		
		ArrayList<Frame> frames = new ArrayList<Frame>();
		
		frames.add(frame1);
		frames.add(frame2);
		frames.add(frame3);
		
		if(frame1.getTempoCarga() > frame2.getTempoCarga()) {
		
		
		
	}
	
	
	
	

}

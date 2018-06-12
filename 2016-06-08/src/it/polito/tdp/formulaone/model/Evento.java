package it.polito.tdp.formulaone.model;

public class Evento implements Comparable <Evento>{
	
	private FantaPilota fp;
	private int lap;
	private int time;
	
	public Evento(FantaPilota fp, int lap, int time) {
		super();
		this.fp = fp;
		this.lap = lap;
		this.time = time;
	}

	public FantaPilota getFp() {
		return fp;
	}

	public void setFp(FantaPilota fp) {
		this.fp = fp;
	}

	public int getLap() {
		return lap;
	}

	public void setLap(int lap) {
		this.lap = lap;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public int compareTo(Evento o) {
		return Integer.compare(this.time, o.time);
	}
	
	
	

}

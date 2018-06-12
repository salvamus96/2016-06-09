package it.polito.tdp.formulaone.model;

import java.util.PriorityQueue;

public class Simulazione {
	
	private Model model;
	
	private PriorityQueue<Evento> pq;
	
	public Simulazione (Model model) {
		this.model = model;
		this.pq = new PriorityQueue<>();
	}
	
	public void simula() {
		
		// Inizializzazione: ogni pilota è al suo primo giro
		for (FantaPilota fp : model.getFantaPiloti())
			this.pq.add(new Evento (fp, 0, fp.getLapTimes().get(0)));
		
		// Processo gli eventi
		while (!pq.isEmpty()) {
			Evento e = pq.poll();
			
			// Assegnare dei punti al pilota
			int count = 0;
			for (FantaPilota ifp : model.getFantaPiloti())
				// conto quanti piloti hanno concluso il giro
				if (ifp.getLap() >= e.getLap())
					count ++;
			
			// Se la posizione del pilora è migliore di quella del giro precedente
			// Aggiorno il punteggio
			if (count < e.getFp().getRank()) {
				int points = e.getFp().getPoints();
				e.getFp().setPoints(points);
			}
			e.getFp().setLap(e.getLap());
			e.getFp().setRank(count);
			
			
			// Capire se il pilota è stato doppiato	
			boolean doppiato = false;
			for (FantaPilota ifp : model.getFantaPiloti())
				if (ifp.getLap() > e.getLap() + 1)
					doppiato = true;
			
			if (doppiato) {
				e.getFp().setEliminato();
				System.out.println("Pilota eliminato " + e.getFp());
			
			}else {
				// Inserire un nuovo evento relativo al giro successivo
				if (e.getFp().getLapTimes().size() > e.getLap() + 1) {
					// se ci sono ancora eventi da aggiungere
					int t = e.getFp().getLapTimes().get(e.getLap() + 1);
					pq.add(new Evento (e.getFp(), e.getTime() + t, e.getLap() + 1));
					
				}
			}
			
		}
	
	}

}

package it.polito.tdp.formulaone.model;

import java.util.List;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import it.polito.tdp.formulaone.db.FormulaOneDAO;

public class Model {
	
	private FormulaOneDAO fonedao;
	private SimpleDirectedWeightedGraph<Driver, DefaultWeightedEdge> grafo;
	private DriverIdMap driverIdMap;
	private List<Driver> drivers;
	
	private List <FantaPilota> fantaPiloti;
	
	public Model() {
		fonedao = new FormulaOneDAO();
		driverIdMap = new DriverIdMap();
		drivers = fonedao.getAllDrivers(driverIdMap);
		System.out.println(driverIdMap);
	}

	public List<Season> getAllSeasons() {
		return fonedao.getAllSeasons();
	}
	
	public List<Driver> getAllDrivers() {
		return this.drivers;
	}
	
	public void simula(int circuitId, Driver driver) {
		
		this.fantaPiloti = this.fonedao.getFantaPiloti(circuitId, driver);
		
		// è utile passare un riferimento di model alla classe Simulazione
		Simulazione sim = new Simulazione(this);
		sim.simula();
	}

	public List <FantaPilota> getFantaPiloti() {
		return fantaPiloti;
	}
}

package models.regions;

import java.util.Collections;
import java.util.List;

public class Region {

	private List<Region> neighbours;
	private ERegionPower power;
	private ERegionType type;
	
	public Region(List<Region> regions, ERegionType type, ERegionPower power){
		this.neighbours = regions;
		this.power = power;
		this.type = type;
	}
	
	public ERegionType getType(){
		return this.type;
	}
	
	public ERegionPower getPower(){
		return this.power;
	}
	
	public List<Region> getNeighbours(){
		return Collections.unmodifiableList(this.neighbours);
	}
}

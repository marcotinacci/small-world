package models.regions;

import java.util.LinkedList;

import org.junit.Test;

import junit.framework.TestCase;

public class RegionTest extends TestCase {
	
	@Test
	public void testCreateSuccessZeroNeighbours(){
		LinkedList<Region> regions = new LinkedList<Region>();
		Region region = new Region(regions, ERegionType.FARMLAND, ERegionPower.MAGIC);
		assertEquals(region.getType(), ERegionType.FARMLAND);
		assertEquals(region.getPower(), ERegionPower.MAGIC);
		assertEquals(region.getNeighbours().size(), 0);
	}
	
	@Test
	public void testCreateSuccess(){
		Region r1 = new Region(new LinkedList<Region>(), ERegionType.FARMLAND, ERegionPower.MAGIC);
		Region r2 = new Region(new LinkedList<Region>(), ERegionType.FOREST, ERegionPower.MINE);
		LinkedList<Region> regions = new LinkedList<Region>();
		regions.add(r1); regions.add(r2);
		Region r3 = new Region(regions, ERegionType.HILL, ERegionPower.TUNNEL);
		assertEquals(r3.getType(), ERegionType.HILL);
		assertEquals(r3.getPower(), ERegionPower.TUNNEL);
		assertEquals(r3.getNeighbours().size(), 2);
		assertEquals(r1.getNeighbours().size(), 0);
		assertEquals(r2.getNeighbours().size(), 0);
	}

}

package Task1;

public class MovingCostCalculator implements Visitor {

	private double costs;

	@Override
	public void visitGlass(Glass g) {
		
		costs = 0;
		switch (g.getThickness()) {
		case 1:
			costs = ((double)g.getLenght()/100) * 2; 
			break;
		case 2:
			costs = ((double)g.getLenght()/100) * 1.2; 
			break;
		case 3:
			costs = ((double)g.getLenght()/100) * 0.7; 
			break;
		default:
			break;
		}
		
		System.out.println("Total Cost for " + g.getName() + " is: " + costs + " Euros");

	}

	@Override
	public void visitFurniture(Furniture f) {
		
		costs = 0;
		costs = ((double)f.getWeight()/20) * 5;
		
		System.out.println("Total Cost for " + f.getName() + " is: " + costs + " Euros");

	}

	@Override
	public void visitElectronic(Electronic e) {
		
		costs = 0;
		
		if(e.getFragile() == true) {
			costs = ((double)e.getWeight()/10) * 5;
		}else {
			costs = ((double)e.getWeight()/15) * 5;
		}

		System.out.println("Total Cost for " + e.getName() + " is: " + costs + " Euros");
	}
}

class Item {
	int id;
	String name;
	double price;
	//TODO add variable.
	char tax;
	//TODO constructor
	public Item(){
		id = 0;
		name = "";
		price = "";
		tax = 0;
	}
	
	public Item(int id, String name, double price, char tax){
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	 
	//TODO setters and getters
	public void setId(int id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setTax(char tax){
		this.tax = tax;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public char getTax(){
		return this.tax;
	}
	
	double taxReturn () {
		//TODO
		if (this.tax == "А"){
			return price * 0.18 * 0.15;
		}
		else if (this.tax == "Б"){
			return price * 0.05 * 0.15;
		} else return 0;
	}
}
package day42;

public class House {
	public String type;
	public double price;
	public String address;
	public int numberOfRooms;
	public int numberOfFloor;
	public String kitchenStyle;
	public boolean isPoolThere;
	public double heightOfCeiling;
	public int numberOfRestrooms;
	
	
	
	
	public House(String type, double price) {
		super();
		this.type = type;
		this.price = price;
	}
	@Override
	public String toString() {
		return "House [type=" + type + ", price=" + price + ", address=" + address + ", numberOfRooms=" + numberOfRooms
				+ ", numberOfFloor=" + numberOfFloor + ", kitchenStyle=" + kitchenStyle + ", isPoolThere=" + isPoolThere
				+ ", heightOfCeiling=" + heightOfCeiling + ", numberOfRestrooms=" + numberOfRestrooms + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		long temp;
		temp = Double.doubleToLongBits(heightOfCeiling);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isPoolThere ? 1231 : 1237);
		result = prime * result + ((kitchenStyle == null) ? 0 : kitchenStyle.hashCode());
		result = prime * result + numberOfFloor;
		result = prime * result + numberOfRestrooms;
		result = prime * result + numberOfRooms;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (Double.doubleToLongBits(heightOfCeiling) != Double.doubleToLongBits(other.heightOfCeiling))
			return false;
		if (isPoolThere != other.isPoolThere)
			return false;
		if (kitchenStyle == null) {
			if (other.kitchenStyle != null)
				return false;
		} else if (!kitchenStyle.equals(other.kitchenStyle))
			return false;
		if (numberOfFloor != other.numberOfFloor)
			return false;
		if (numberOfRestrooms != other.numberOfRestrooms)
			return false;
		if (numberOfRooms != other.numberOfRooms)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	public House() {}
	
}

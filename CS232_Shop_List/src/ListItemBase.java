/**
 * Base abstract class for an instance of an item in a list.
 * 
 * This class support multiple instance of an item in a list with different
 * priorities. An example would be inclusion of a first gallon of milk with a
 * high priority and then a second with a lower priority.
 * 
 * Similar to list items all list Item Instances must have an equals method and
 * the equals method may vary based on the type of list.
 * 
 * There is a static class Semaphore that maintains listItemIDs and prevents
 * duplicates.
 * 
 * @author Walter Stock
 *
 */

public abstract class ListItemBase {

	private int listItemID;

	public abstract boolean equals();

	public void setListItemID(int newID) {
		listItemID = newID;
	}

	public int getListItemID() {
		return listItemID;
	}

}
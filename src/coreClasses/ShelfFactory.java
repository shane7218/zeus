package coreClasses;

public class ShelfFactory {

	public ShelfFactory() 
	{
		
	}
	
	public I_Shelf makeShelve(int type, int id)
	{
		I_Shelf shelve;
		
		switch(type)
		{
		case 1:
			shelve = new Shelf(id, 400, 1000, 100, 8, 4, 2);
			break;
		case 2:
			shelve = new Shelf(id,400, 1000, 100, 40, 0, 0);
			break;
		case 3:
			shelve = new Shelf(id,400, 1000, 100, 0, 12, 0);
			break;
		case 4:
			shelve = new Shelf(id,400, 1000, 100, 0, 0, 6);
			break;
		default:
			shelve = null;
		}
		
		return shelve;
	}

}
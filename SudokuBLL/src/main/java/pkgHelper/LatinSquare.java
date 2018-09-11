package pkgHelper;

public class LatinSquare {

	private int[][] LatinSquare;
	
	
	public boolean ContainsZero()
	{
		for (int iCol = 0; iCol < LatinSquare.length; iCol++)
		{
			for (int iRow = 0; iRow < LatinSquare.length; iRow++)
			{
				if (LatinSquare[iCol][iRow] == 0)
				{
					return true;
				}
			}
		}
	return false;

	}
	
	public boolean getColumn()
}
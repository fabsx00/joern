package extrapolator;

import java.io.IOException;

import lucene.LuceneIndexAccessor;

public class TermDocumentMatrixBuilder extends LuceneIndexAccessor
{
	public TermDocumentMatrixBuilder(String directoryName)
	{
		initialize(directoryName);
	}

	public TermDocumentMatrix create() throws IOException
	{
		return null;
		
	}
}

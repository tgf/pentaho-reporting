package org.pentaho.reporting.ui.datasources.kettle;

import org.pentaho.reporting.engine.classic.core.DataFactory;
import org.pentaho.reporting.engine.classic.core.designtime.DataFactoryChangeRecorder;
import org.pentaho.reporting.engine.classic.core.designtime.DesignTimeContext;
import org.pentaho.reporting.engine.classic.core.metadata.DataFactoryMetaData;
import org.pentaho.reporting.engine.classic.core.metadata.DataFactoryRegistry;
import org.pentaho.reporting.engine.classic.extensions.datasources.kettle.EmbeddedKettleDataFactoryEditor;

public class EmbeddedTransformationDataSourcePlugin extends KettleDataSourcePlugin implements EmbeddedKettleDataFactoryEditor
{
  private String metaDataId;

  public EmbeddedTransformationDataSourcePlugin()
  {
  }

  public void configure(final String metaDataId)
  {
    this.metaDataId = metaDataId;
  }

  public DataFactory performEdit(final DesignTimeContext context,
                                 final DataFactory input,
                                 final String selectedQueryName,
                                 final DataFactoryChangeRecorder changeRecorder)
  {
    if (input != null)
    {
      return super.performEdit(context, input, selectedQueryName, changeRecorder);
    }
    // we are asked to create a new data-factory.
    final KettleDataSourceDialog kettleDataSourceDialog = createKettleDataSourceDialog(context);
    return kettleDataSourceDialog.performCreateUnifiedDataFactory(context, input, "Query1", 
                                                                  changeRecorder, getMetaData());
  }

  public DataFactoryMetaData getMetaData()
  {
    return DataFactoryRegistry.getInstance().getMetaData(metaDataId);
  }
}
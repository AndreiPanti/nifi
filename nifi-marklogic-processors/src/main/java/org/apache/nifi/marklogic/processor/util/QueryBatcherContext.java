package org.apache.nifi.marklogic.processor.util;

public class QueryBatcherContext<DataMovementManager, QueryBatcher, QueryDefinition> {

    private final DataMovementManager manager;
    private final QueryBatcher batcher;
    private final QueryDefinition definition;

    public QueryBatcherContext(DataMovementManager manager, QueryBatcher batcher, QueryDefinition definition) {
        this.manager = manager;
        this.batcher = batcher;
        this.definition = definition;
    }

    public DataMovementManager getManager() { return manager; }
    public QueryBatcher getBatcher() { return batcher; }
    public QueryDefinition getDefinition() { return definition; }
}
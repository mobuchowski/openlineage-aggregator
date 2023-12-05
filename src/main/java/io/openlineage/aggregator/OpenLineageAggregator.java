package io.openlineage.aggregator;

import org.apache.flink.streaming.api.functions.KeyedProcessFunction;
import org.apache.flink.util.Collector;
import io.openlineage.client.OpenLineage;

import java.util.UUID;

public class OpenLineageAggregator extends KeyedProcessFunction<UUID, OpenLineage.RunEvent, OpenLineage.RunEvent> {
  @Override
  public void processElement(OpenLineage.RunEvent event, Context context, Collector<OpenLineage.RunEvent> collector) throws Exception {

  }
}

package io.cdap.wrangler.statistics;

import io.cdap.wrangler.api.Row;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class AggregateStatsTest {

  @Test
  public void testAggregate() {
    AggregateStats aggregateStats = new AggregateStats();
    // create sample rows and call aggregate
    Row result = aggregateStats.aggregate(/* your rows here */);
    assertNotNull(result);
    // Add assertions to validate the results
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 22:09:18 GMT 2019
 */

package de.outstare.fortbattleplayer.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.statistics.AllStatistics;
import de.outstare.fortbattleplayer.statistics.BattleStatistics;
import de.outstare.fortbattleplayer.statistics.CombatantStatistic;
import de.outstare.fortbattleplayer.statistics.RoundStatGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AllStatistics_ESTest extends AllStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CombatantStatistic combatantStatistic0 = new CombatantStatistic(0);
      BattleStatistics battleStatistics0 = new BattleStatistics(1607, 0);
      RoundStatGenerator roundStatGenerator0 = new RoundStatGenerator();
      AllStatistics allStatistics0 = new AllStatistics(combatantStatistic0, battleStatistics0, roundStatGenerator0);
  }
}

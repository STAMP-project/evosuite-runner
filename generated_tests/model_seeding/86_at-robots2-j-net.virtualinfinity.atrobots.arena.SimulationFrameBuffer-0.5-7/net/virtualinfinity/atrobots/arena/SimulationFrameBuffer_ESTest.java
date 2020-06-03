/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 20:17:31 GMT 2019
 */

package net.virtualinfinity.atrobots.arena;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import net.virtualinfinity.atrobots.arena.SimulationFrame;
import net.virtualinfinity.atrobots.arena.SimulationFrameBuffer;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.gui.RobotStatusPane;
import net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot;
import net.virtualinfinity.atrobots.snapshots.RobotSnapshot;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimulationFrameBuffer_ESTest extends SimulationFrameBuffer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      LinkedHashSet<ArenaObjectSnapshot> linkedHashSet0 = new LinkedHashSet<ArenaObjectSnapshot>();
      PriorityQueue<RobotSnapshot> priorityQueue0 = new PriorityQueue<RobotSnapshot>();
      SimulationFrame simulationFrame0 = new SimulationFrame(linkedHashSet0, priorityQueue0, false);
      simulationFrameBuffer0.setFrame(simulationFrame0);
      SimulationFrame simulationFrame1 = simulationFrameBuffer0.getCurrentFrame();
      assertFalse(simulationFrame1.isRoundOver());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      simulationFrameBuffer0.addSimulationObserver((SimulationObserver) null);
      // Undeclared exception!
      try { 
        simulationFrameBuffer0.setFrame((SimulationFrame) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.SimulationFrameBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      TreeSet<SimulationObserver> treeSet0 = new TreeSet<SimulationObserver>();
      simulationFrameBuffer0.observers = (Collection<SimulationObserver>) treeSet0;
      // Undeclared exception!
      try { 
        simulationFrameBuffer0.removeSimulationObserver((SimulationObserver) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      RobotStatusPane robotStatusPane0 = RobotStatusPane.createRobotStatusPane();
      simulationFrameBuffer0.addSimulationObserver(robotStatusPane0);
      simulationFrameBuffer0.setFrame((SimulationFrame) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      Stack<RobotSnapshot> stack0 = new Stack<RobotSnapshot>();
      HashSet<ArenaObjectSnapshot> hashSet0 = new HashSet<ArenaObjectSnapshot>(stack0);
      SimulationFrame simulationFrame0 = new SimulationFrame(hashSet0, stack0, true);
      simulationFrameBuffer0.setFrame(simulationFrame0);
      SimulationFrame simulationFrame1 = simulationFrameBuffer0.getCurrentFrame();
      assertTrue(simulationFrame1.isRoundOver());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      RobotStatusPane robotStatusPane0 = RobotStatusPane.createRobotStatusPane();
      simulationFrameBuffer0.removeSimulationObserver(robotStatusPane0);
      assertFalse(robotStatusPane0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      SimulationFrame simulationFrame0 = simulationFrameBuffer0.getCurrentFrame();
      assertNull(simulationFrame0);
  }
}

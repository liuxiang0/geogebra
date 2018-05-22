package org.geogebra.common.kernel.stepbystep.steps;

import org.geogebra.common.kernel.stepbystep.solution.SolutionBuilder;
import org.geogebra.common.kernel.stepbystep.steptree.StepSolvable;
import org.geogebra.common.kernel.stepbystep.steptree.StepVariable;

public interface SolveStepGenerator {

	Result apply(StepSolvable se, StepVariable sv, SolutionBuilder sb, SolveTracker tracker);
}

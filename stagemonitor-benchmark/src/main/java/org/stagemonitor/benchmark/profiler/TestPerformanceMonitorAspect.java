package org.stagemonitor.benchmark.profiler;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.stagemonitor.requestmonitor.profiler.ProfilingAspect;

@Aspect
public class TestPerformanceMonitorAspect extends ProfilingAspect {

	@Pointcut("execution(* org.stagemonitor.benchmark.profiler.ClassToProfile.*(..))")
	public void methodsToProfile() {
	}
}

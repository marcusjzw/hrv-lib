package hrv.calc.continous;

import hrv.calc.parameter.HRVParameter;

@FunctionalInterface
public interface HRVParameterChangedListener {

	public void parameterChanged(HRVParameter param);
}

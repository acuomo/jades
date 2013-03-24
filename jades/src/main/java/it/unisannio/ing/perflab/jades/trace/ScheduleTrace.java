/*******************************************************************************
 * Copyright 2012 Antonio Cuomo
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package it.unisannio.ing.perflab.jades.trace;

import java.util.Locale;

public class ScheduleTrace extends Trace {

    private double wakeUpTime;
    private int scheduledProcessIdentity;

    public ScheduleTrace(double wakeUpTime, int scheduledProcessIdentity) {
        this.wakeUpTime = wakeUpTime;
        this.scheduledProcessIdentity = scheduledProcessIdentity;
    }

    public String toString() {
        String format = "%d\t%9.3f\t%15s\t%d\t%d\tsched proc: t = %.3f, id = %d";
        return String.format(Locale.ENGLISH, format, traceId, time,
                processName, processId, processPriority, wakeUpTime,
                scheduledProcessIdentity);
    }
}

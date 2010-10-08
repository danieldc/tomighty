/*
Copyright 2010 C�lio Cidral Junior

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.tomighty.ui.state;

import java.awt.Component;

import javax.swing.Action;

import org.tomighty.ui.state.widget.LabelFactory;


public class PomodoroFinished extends UiStateSupport {

	@Override
	protected String title() {
		return "Pomodoro finished";
	}

	@Override
	protected Component createContent() {
		return LabelFactory.medium("Take a break");
	}

	@Override
	protected Action[] primaryActions() {
		return new Action[] {
			new ToState("Short", ShortBreak.class),
			new ToState("Long",  LongBreak.class)
		};
	}

	@Override
	protected Action[] secondaryActions() {
		return new Action[] {
			new ToState("New pomodoro", Pomodoro.class)
		};
	}

}

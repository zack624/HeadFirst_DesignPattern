package edu.nust.commandpattern;

import edu.nust.commandpattern.command.CellingFanOffCommand;
import edu.nust.commandpattern.command.CellingFanOnCommand;
import edu.nust.commandpattern.command.Command;
import edu.nust.commandpattern.command.LightOffCommand;
import edu.nust.commandpattern.command.LightOnCommand;
import edu.nust.commandpattern.command.MacroCommand;

/**
 * 命令模式（Command Pattern）
 * 将“请求”封装成对象，以便使用不同的请求、队列或日志来参数化其他对象，同时支持可撤销操作
 * @author zack
 * @since 2016年7月15日
 */
public class Demo {
	public static void main(String[] args) {
//		单个命令时
//		Light light = new Light();
//		RemoteControl rControl = new RemoteControl();
//		
//		Command lightOnC = new LightOnCommand(light);
//		rControl.setCommand(lightOnC);
//		rControl.OnButtonWasPushed();
//		
//		Command lightOffC = new LightOffCommand(light);
//		rControl.setCommand(lightOffC);
//		rControl.OffButtonWasPushed();
		
//		多个命令时
		RemoteControl rc = new RemoteControl();
		Light l = new Light();
		rc.setCommands(0, new LightOnCommand(l), new LightOffCommand(l));
		
		CellingFan cf = new CellingFan();
//		rc.setCommands(1, new CellingFanOnCommand(cf), new CellingFanOffCommand(cf));
//		
//		rc.showButtonDescription();
//		
//		rc.OnButtonWasPushed(0);
//		rc.OffButtonWasPushed(0);
//		rc.undoButtonWasPushed();
//		
//		rc.OnButtonWasPushed(1);
//		rc.OffButtonWasPushed(1);
//		rc.undoButtonWasPushed();

//		宏命令
		Command[] ocs = new Command[]{new CellingFanOnCommand(cf),new LightOnCommand(l),new LightOnCommand(l)};
		Command[] ofcs = new Command[]{new CellingFanOffCommand(cf),new LightOffCommand(l),new LightOffCommand(l)};
		Command onMacro = new MacroCommand(ocs);
		Command offMacro = new MacroCommand(ofcs);
		
		rc.setCommands(0, onMacro, offMacro);
		
//		rc.OnButtonWasPushed(0);
		rc.OffButtonWasPushed(0);
		System.out.println("------undo------");
		rc.undoButtonWasPushed();
	}
}

package Facade.ProgramCreek.facade;

import Facade.ProgramCreek.classes.CPU;
import Facade.ProgramCreek.classes.HardDrive;
import Facade.ProgramCreek.classes.Memory;

public class Computer {
 
    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
 
    public void run() {
        cpu.processData();
        memory.load();
        hardDrive.readdata();
    }
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
}

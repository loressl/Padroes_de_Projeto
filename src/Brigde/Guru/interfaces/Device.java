package Brigde.Guru.interfaces;

public interface Device {
	public boolean isEnabled();
	public void enable();
	public void disable();
	public int getVolume();
	public void setVolume(int volume);
	public int getChannel();
	public void setChannel(int channel);
	public void printStatus();
}

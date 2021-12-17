package jake2.sound;

import java.nio.ByteBuffer;

/**
 * DummyDriver
 * 
 * @author cwei
 */
public final class DummyDriver implements Sound {

	static {
		S.register(new DummyDriver());
	};
	
	private DummyDriver() {
	}

	/* (non-Javadoc)
	 * @see jake2.sound.Sound#Init()
	 */
	public boolean Init() {
		return true;
	}

	/* (non-Javadoc)
	 * @see jake2.sound.Sound#Shutdown()
	 */
	public void Shutdown() {
	}

	/* (non-Javadoc)
	 * @see jake2.sound.Sound#BeginRegistration()
	 */
	public void BeginRegistration() {
	}

	/* (non-Javadoc)
	 * @see jake2.sound.Sound#RegisterSound(java.lang.String)
	 */
	public sfx_t RegisterSound(String sample) {
		return null;
	}

	/* (non-Javadoc)
	 * @see jake2.sound.Sound#EndRegistration()
	 */
	public void EndRegistration() {
	}

	/* (non-Javadoc)
	 * @see jake2.sound.Sound#StartLocalSound(java.lang.String)
	 */
	public void StartLocalSound(String sound) {
	}

	/* (non-Javadoc)
	 * @see jake2.sound.Sound#StartSound(float[], int, int, jake2.sound.sfx_t, float, float, float)
	 */
	public void StartSound(float[] origin, int entnum, int entchannel, sfx_t sfx, float fvol, float attenuation, float timeofs) {
	}

	/* (non-Javadoc)
	 * @see jake2.sound.Sound#Update(float[], float[], float[], float[])
	 */
	public void Update(float[] origin, float[] forward, float[] right, float[] up) {
	}

	/* (non-Javadoc)
	 * @see jake2.sound.Sound#RawSamples(int, int, int, int, byte[])
	 */
	public void RawSamples(int samples, int rate, int width, int channels, ByteBuffer data) {
	}

    public void disableStreaming() {
    }

    /* (non-Javadoc)
	 * @see jake2.sound.Sound#StopAllSounds()
	 */
	public void StopAllSounds() {
	}

	/* (non-Javadoc)
	 * @see jake2.sound.Sound#getName()
	 */
	public String getName() {
		return "dummy";
	}
}

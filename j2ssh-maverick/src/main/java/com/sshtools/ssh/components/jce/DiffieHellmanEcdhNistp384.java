package com.sshtools.ssh.components.jce;

public class DiffieHellmanEcdhNistp384 extends DiffieHellmanEcdh {

	public DiffieHellmanEcdhNistp384() {
		super("ecdh-sha2-nistp384", "secp384r1", "SHA-384");
	}

}
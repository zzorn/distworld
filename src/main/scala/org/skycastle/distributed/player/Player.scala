package org.skycastle.distributed.player

/**
 * Someone or something playing the game.
 * Can control character(s) and assets they own.
 * Has a known public key.
 */
trait Player {

  def publicKey: String

}
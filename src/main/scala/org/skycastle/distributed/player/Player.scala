package org.skycastle.distributed.player

import org.skycastle.distributed.event.Event

/**
 * Someone or something playing the game.
 * Can control character(s) and assets they own.
 * Has a known public key.
 */
trait Player {

  def publicKey: String


}
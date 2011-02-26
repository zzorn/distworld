package org.skycastle.distributed.zone

import org.skycastle.distributed.event.Event

/**
 * Locally stored up to date information about a zone.
 */
class LocalZone extends Zone {

  /**
   * Called when an event has occured, according to some external node.
   */
  def onEvent(event: Event) {

    // Check event preconditions

    // Execute / simulate event

    // Check event result

    // If the event/action has same preconditions and results, accept it.
    // Otherwise, report missmatch


  }



}
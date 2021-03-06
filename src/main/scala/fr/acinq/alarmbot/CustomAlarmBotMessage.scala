package fr.acinq.alarmbot

/**
 * Should be extended by other plugins to get their messages sent to TG through this plugin
 * (1) Include Alarmbot plugin (this one) in your own plugin dependencies
 * (2) Extend this trait, implement methods and broadcast when needed
 * (3) Alarmbot will catch your custom message and send it to TG
 */
trait CustomAlarmBotMessage {
  def senderEntity: String
  def message: String
}

//
fun isHighPriority(priority: Int) : Boolean {
    return priority == 1 || priority == 2
}
fun formatPolicyName(policy: String) : String {
    val upperPolicy = policy.uppercase()
    return "Policy: $upperPolicy"
}
fun main() {
    println(isHighPriority(1))
    println(isHighPriority(2))
    println(isHighPriority(3))
    println(formatPolicyName(policy = "Accept_Trusted_Internal_Traffic"))
    val status = "active"
    val outMessage = when (status) {
        "active" -> {
            "The Policy is Active!"
        }
        "inactive" -> {
            "The policy is Inactive!"
        }
        "pending" -> {
            "The policy is Pending!"
        }
        else -> {
            "Policy Status is unknown"
        }
    }
    println(outMessage)

    val firewallRules = listOf("Allow_VPN5_Access", "Allow_DNS_Server_SSH_Access", "Block_Telnet_Traffic", "Deny_All_External_ICMP", "Permit_Internal_DNS")
    firewallRules.forEach {name -> println(name)}

    val firewallPolicies = mapOf("Accept_Trusted_Internal_Traffic" to "active", "Allow_Secure_Web_Browsing" to "pending", "Restrict_Remote_Admin_Access" to "inactive")
    firewallPolicies.forEach { (name, status) -> println("$name : $status")}
}

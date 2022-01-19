package myosyn.nabi.extensions.commands.moderation

import com.kotlindiscord.kord.extensions.checks.hasPermission
import com.kotlindiscord.kord.extensions.extensions.Extension
import com.kotlindiscord.kord.extensions.extensions.publicSlashCommand
import dev.kord.common.entity.Permission

class TakeRole : Extension() {
    override val name: String = "takerole"

    override suspend fun setup() {
        publicSlashCommand(::TakeRole) {
            name = "TakeRole"
            description = "Takes a role away from someone."
            check {
                hasPermission(Permission.ManageRoles)
                requireBotPermissions(Permission.ManageRoles)

            }
        }
    }
}
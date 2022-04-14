package grifferthrydwy.favourablewinds;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class WindsoulItem extends Item {
    public WindsoulItem(Settings settings) {
        super(settings.maxDamageIfAbsent(10));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        // TODO each tick, restore x durability
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        Vec3d vec3d = user.getRotationVector();
        double d = 1.5D;
        double e = 0.1D;
        Vec3d vec3d2 = user.getVelocity();
        user.setVelocity(vec3d2.add(vec3d.x * 0.1D + (vec3d.x * 1.5D - vec3d2.x) * 0.5D, vec3d.y * 0.1D + (vec3d.y * 1.5D - vec3d2.y) * 0.5D, vec3d.z * 0.1D + (vec3d.z * 1.5D - vec3d2.z) * 0.5D));
        // add velocity - credit to FireworkRocketEntity.java
        // TODO add durability
        // TODO add particles
        return TypedActionResult.success(user.getStackInHand(hand), world.isClient());
    }


}

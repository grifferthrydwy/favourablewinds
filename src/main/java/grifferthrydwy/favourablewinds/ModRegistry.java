package grifferthrydwy.favourablewinds;


import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.Registry;

public class ModRegistry {

    public static Item WIND_SOUL = new WindsoulItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
    public static final DefaultParticleType WHOOSH_PARTICLE = FabricParticleTypes.simple();
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("favourablewinds", "wind_soul"), WIND_SOUL);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier("favourablewinds", "whoosh_particle"), WHOOSH_PARTICLE);
    }
}


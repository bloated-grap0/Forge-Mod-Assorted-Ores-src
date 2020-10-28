package net.mcreator.assorteditems.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.assorteditems.ElementsAssortedItemsMod;

import java.util.Map;

@ElementsAssortedItemsMod.ModElement.Tag
public class ProcedureThornsEntityCollidesInTheBlock extends ElementsAssortedItemsMod.ModElement {
	public ProcedureThornsEntityCollidesInTheBlock(ElementsAssortedItemsMod instance) {
		super(instance, 342);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ThornsEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.CACTUS, (float) 1.5);
	}
}

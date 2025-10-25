package c.d.c.b;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: c.d.c.b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0260b {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f4194a = new Type[0];

    public static ParameterizedType a(Type type, Type type2, Type... typeArr) {
        return new C0050b(type, type2, typeArr);
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static WildcardType b(Type type) {
        Type[] upperBounds;
        if (type instanceof WildcardType) {
            upperBounds = ((WildcardType) type).getUpperBounds();
        } else {
            upperBounds = new Type[]{type};
        }
        return new c(upperBounds, f4194a);
    }

    public static WildcardType c(Type type) {
        Type[] lowerBounds;
        if (type instanceof WildcardType) {
            lowerBounds = ((WildcardType) type).getLowerBounds();
        } else {
            lowerBounds = new Type[]{type};
        }
        return new c(new Type[]{Object.class}, lowerBounds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [c.d.c.b.b$a] */
    public static Type d(Type type) {
        if (type instanceof Class) {
            Class aVar = (Class) type;
            if (aVar.isArray()) {
                aVar = new a(d(aVar.getComponentType()));
            }
            return aVar;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0050b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static Class<?> e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            AbstractC0233a.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return e(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static String f(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (interfaces[i2] == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(interfaces[i2])) {
                    return a(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static Type b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        AbstractC0233a.a(cls2.isAssignableFrom(cls));
        return a(type, cls, a(type, cls, cls2));
    }

    public static Type g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type a(Type type, Class<?> cls) {
        Type typeB = b(type, cls, Collection.class);
        if (typeB instanceof WildcardType) {
            typeB = ((WildcardType) typeB).getUpperBounds()[0];
        }
        if (typeB instanceof ParameterizedType) {
            return ((ParameterizedType) typeB).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type[] b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeB = b(type, cls, Map.class);
        if (typeB instanceof ParameterizedType) {
            return ((ParameterizedType) typeB).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        return a(type, cls, type2, new HashSet());
    }

    private static Type a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = a(type, cls, (TypeVariable<?>) typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeA = a(type, cls, componentType, collection);
                return componentType == typeA ? cls2 : a(typeA);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeA2 = a(type, cls, genericComponentType, collection);
            return genericComponentType == typeA2 ? genericArrayType : a(typeA2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeA3 = a(type, cls, ownerType, collection);
            boolean z = typeA3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeA4 = a(type, cls, actualTypeArguments[i2], collection);
                if (typeA4 != actualTypeArguments[i2]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i2] = typeA4;
                }
            }
            return z ? a(typeA3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (!(type2 instanceof WildcardType)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (lowerBounds.length == 1) {
            Type typeA5 = a(type, cls, lowerBounds[0], collection);
            if (typeA5 != lowerBounds[0]) {
                return c(typeA5);
            }
        } else if (upperBounds.length == 1) {
            Type typeA6 = a(type, cls, upperBounds[0], collection);
            if (typeA6 != upperBounds[0]) {
                return b(typeA6);
            }
        }
        return wildcardType;
    }

    static Type a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsA = a(typeVariable);
        if (clsA == null) {
            return typeVariable;
        }
        Type typeA = a(type, cls, clsA);
        if (!(typeA instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeA).getActualTypeArguments()[a((Object[]) clsA.getTypeParameters(), (Object) typeVariable)];
    }

    private static int a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    private static Class<?> a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static void h(Type type) {
        AbstractC0233a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: c.d.c.b.b$b, reason: collision with other inner class name */
    private static final class C0050b implements ParameterizedType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f4197a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f4198b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f4199c;

        public C0050b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                AbstractC0233a.a(z);
            }
            this.f4197a = type == null ? null : AbstractC0260b.d(type);
            this.f4198b = AbstractC0260b.d(type2);
            this.f4199c = (Type[]) typeArr.clone();
            int length = this.f4199c.length;
            for (int i2 = 0; i2 < length; i2++) {
                AbstractC0233a.a(this.f4199c[i2]);
                AbstractC0260b.h(this.f4199c[i2]);
                this.f4199c[i2] = AbstractC0260b.d(this.f4199c[i2]);
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f4199c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f4198b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f4197a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && AbstractC0260b.a((Type) this, (Type) obj);
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f4199c) ^ this.f4198b.hashCode()) ^ AbstractC0260b.a((Object) this.f4197a);
        }

        public String toString() {
            int length = this.f4199c.length;
            if (length == 0) {
                return AbstractC0260b.f(this.f4198b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(AbstractC0260b.f(this.f4198b));
            sb.append("<");
            sb.append(AbstractC0260b.f(this.f4199c[0]));
            for (int i2 = 1; i2 < length; i2++) {
                sb.append(", ");
                sb.append(AbstractC0260b.f(this.f4199c[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: c.d.c.b.b$a */
    private static final class a implements GenericArrayType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f4195a;

        public a(Type type) {
            this.f4195a = AbstractC0260b.d(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f4195a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && AbstractC0260b.a((Type) this, (Type) obj);
        }

        public int hashCode() {
            return this.f4195a.hashCode();
        }

        public String toString() {
            return AbstractC0260b.f(this.f4195a) + "[]";
        }
    }

    /* renamed from: c.d.c.b.b$c */
    private static final class c implements WildcardType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f4203a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f4204b;

        public c(Type[] typeArr, Type[] typeArr2) {
            AbstractC0233a.a(typeArr2.length <= 1);
            AbstractC0233a.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                AbstractC0233a.a(typeArr2[0]);
                AbstractC0260b.h(typeArr2[0]);
                AbstractC0233a.a(typeArr[0] == Object.class);
                this.f4204b = AbstractC0260b.d(typeArr2[0]);
                this.f4203a = Object.class;
                return;
            }
            AbstractC0233a.a(typeArr[0]);
            AbstractC0260b.h(typeArr[0]);
            this.f4204b = null;
            this.f4203a = AbstractC0260b.d(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f4203a};
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return this.f4204b != null ? new Type[]{this.f4204b} : AbstractC0260b.f4194a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && AbstractC0260b.a((Type) this, (Type) obj);
        }

        public int hashCode() {
            return (this.f4204b != null ? this.f4204b.hashCode() + 31 : 1) ^ (this.f4203a.hashCode() + 31);
        }

        public String toString() {
            if (this.f4204b != null) {
                return "? super " + AbstractC0260b.f(this.f4204b);
            }
            if (this.f4203a == Object.class) {
                return "?";
            }
            return "? extends " + AbstractC0260b.f(this.f4203a);
        }
    }
}
